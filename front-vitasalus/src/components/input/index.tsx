import styled from "styled-components";

interface Props {
    type?: string,
    value?: string,
    placeholder?: string,
    onChange: (value: string) => void;
}

const Field = styled.input`
background: #C4E6BD;
margin: 1em 0;
box-sizing: border-box;
border-radius: 8px;
border: none;
width: 100%;
padding: 16px;
`

export default function Input({type, value, placeholder, onChange} : Props){
    return(
        <Field 
        type = {type}
        value = {value}
        placeholder = {placeholder}
        onChange = {(e) => onChange(e.target.value)}
        required/>
    )
}