import { useState } from "react";
import Input from "../../../components/input";

export default function PatientLogin(){
    const [cpf, setCpf] = useState('')
    
    return(
        <>
            <Input value={cpf} type="text" placeholder="Insira seu CPF" onChange={setCpf}/>
        </>
    )
}