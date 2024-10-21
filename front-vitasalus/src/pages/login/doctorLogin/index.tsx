import { useState } from "react";
import Input from "../../../components/input";

export default function DoctorLogin(){
    const [cpf, setCpf] = useState('')
    
    return(
        <>
            <Input 
            label="CPF"
            value={cpf} 
            type="text" 
            placeholder="Insira seu CPF" 
            onChange={setCpf}/>
        </>
    )
}