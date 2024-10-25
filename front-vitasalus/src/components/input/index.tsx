import styled from "styled-components";

interface Props {
    type: string,
    value: string,
    placeholder: string,
    label?: string,
    onChange: (value: string) => void;
}

const Field = styled.input`
background: #C4E6BD;
margin: 5px;
box-sizing: border-box;
border-radius: 8px;
border: none;
width: 100%;
padding: 16px;
color: black;
`

const Container = styled.div`
weigth: 100%;
`

const Label = styled.label`
color: #519790;
display: block;
font-weight: 700;
font-size 16px;
line-heigth: 19px;
`

export default function Input({ type, value, placeholder, label, onChange }: Props) {
    return (
        <Container>
            <Label>{label}</Label>
            <Field
                type={type}
                value={value}
                placeholder={placeholder}
                onChange={(e) => onChange(e.target.value)}
                required />
        </Container>

    )
}