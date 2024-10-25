import { useState } from "react";
import Input from "../../../components/input";
import { Logo } from "../../../components/logo/styledComponent";
import Title from "../../../components/title";
import Button from "../../../components/button";
import RegisterButton from "../../../components/registerButton";

export default function DoctorLogin(){
    const [cpf, setCpf] = useState('')
    const [senha, setSenha] = useState('')
    
    return(
        <>
            <Logo/>
            <Title>Faça seu Login</Title>
            <Input value={cpf} type="text" placeholder="Insira seu CPF" onChange={setCpf} label="CPF"/>
            <Input value={senha} type="password" placeholder="Insira sua senha" onChange={setSenha} label="Senha"/>
            <Button href="/homeMedico" title="Entrar"/>
            <RegisterButton href="/cadastroMedico" title="Fazer Cadastro"/>
            <p>ou</p>
            <RegisterButton href="/" title="Recuperar senha"/>
        </>
    )
}