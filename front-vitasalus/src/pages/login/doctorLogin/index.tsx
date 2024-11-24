import { useState } from "react"
import Input from "../../../components/input"
import { Logo } from "../../../components/logo/styledComponent"
import Title from "../../../components/title"
import RegisterButton from "../../../components/registerButton"
import { Form, FormButton } from "../../../components/form/styledComponents"
import Login from "../../../types/User"
import UsePost from "../../../usePost"
import { useNavigate } from "react-router-dom"

export default function DoctorLogin(){
    const [cpf, setCpf] = useState('')
    const [password, setPassword] = useState('')
    const { mutate, isSuccess } = UsePost()
    const navigate = useNavigate()

    const handleLogin = async (event: React.FormEvent<HTMLElement>) => {
        event.preventDefault()

        const userLogin: Login = {
            cpf: cpf,
            password: password
        }

        try{
            mutate({
                endpoint: 'auth/login-medico',
                data: userLogin
            })
            navigate('/dashboard')

        } catch {[isSuccess] && alert('Erro ao fazer login')}
    }
    
    return(
        <>
            <Logo/>
            <Title>Faça seu Login</Title>
            <Form onSubmit={handleLogin}>
            <Input value={cpf} type="text" placeholder="Insira seu CPF" onChange={setCpf} label="CPF"/>
            <Input value={password} type="password" placeholder="Insira sua senha" onChange={setPassword} label="Senha"/>
            <FormButton type="submit">Entrar</FormButton>
            </Form>
            <RegisterButton href="/cadastroMedico" title="Fazer Cadastro"/>
            <p>ou</p>
            <RegisterButton href="/" title="Recuperar senha"/>
        </>
    )
}