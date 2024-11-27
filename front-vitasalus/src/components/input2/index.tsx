import styled from "styled-components";

interface Props {
    value: string;
    placeholder: string;
    label?: string;
    onChange: (value: string) => void;
}

const Field = styled.textarea`
    background: #C4E6BD;
    margin: 5px 0;
    box-sizing: border-box;
    border-radius: 7px;
    border: none;
    width: 50%;
    height: 150px; /* Altura ajustável conforme necessário */
    padding: 20px;
    font-size: 16px;
    color: black;
    resize: none; /* Remove o redimensionamento padrão do textarea */
    outline: none;

    &:focus {
        border: 2px solid #519790; /* Adiciona uma borda de destaque ao focar */
    }
`;

const Container = styled.div`
    width: 100%;
`;

const Label = styled.label`
    color: #519790;
    display: block;
    font-weight: 700;
    font-size: 16px;
    line-height: 19px;
    margin-bottom: 5px;
`;

export default function Input2({ value, placeholder, label, onChange }: Props) {
    return (
        <Container>
            {label && <Label>{label}</Label>}
            <Field
                value={value}
                placeholder={placeholder}
                onChange={(e) => onChange(e.target.value)}
                required
            />
        </Container>
    );
}
