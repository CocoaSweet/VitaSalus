import { Step, StepLabel, Stepper } from "@mui/material";
import { Logo } from "../../../components/logo/styledComponent";
import { CustomizedStep, DivLogo } from "./styledComponents";
import { useState } from "react";
import Patient from "../../../types/Patient";
import Title from "../../../components/title";
import { Form, FormButton } from "../../../components/form/styledComponents";
import Input from "../../../components/input";
import UsePost from "../../../usePost";
import { useNavigate } from "react-router-dom";

export default function PatientRegister() {
    const [active, setActive] = useState(0)
    const [name, setName] = useState('')
    const [lastName, setLastName] = useState('')
    const [cpf, setCpf] = useState('')
    const [email, setEmail] = useState('')
    const [telephone, setTelephone] = useState('')
    const [birthDate, setBirthDate] = useState('')
    const [password, setPassword] = useState('')
    const [passwordVerifier, setPasswordVerifier] = useState('')
    const { mutate, isSuccess } = UsePost()
    const navigate = useNavigate()


    const handleSubmit = (event: React.FormEvent<HTMLFormElement>) => {
        event.preventDefault()

        const patient: Patient = {
            nome: name,
            sobrenome: lastName,
            cpf: cpf,
            email: email,
            telefone: telephone,
            dataNascimento: birthDate,
            senha: password
        }

        if (active !== 0) {
            try {
                mutate({
                    endpoint: 'auth/register',
                    data: patient
                })
                navigate('/loginPaciente')
            } catch { [isSuccess] }
        }

        setActive(active + 1)
    }

    return (
        <>
            <DivLogo>
                <Logo />
            </DivLogo>
            <Stepper activeStep={active}>
                <Step>
                    <StepLabel StepIconComponent={(props) => (<CustomizedStep color={props.active ? '#39932A' : '#C4E6BD'} />)} />
                </Step>
                <Step>
                    <StepLabel StepIconComponent={(props) => (<CustomizedStep color={props.active ? '#39932A' : '#C4E6BD'} />)} />
                </Step>
            </Stepper>

            {active === 0 ? (
                <>
                    <Title>Forneça seus dados</Title>
                    <Form onSubmit={handleSubmit}>
                        <Input type="text" value={name} placeholder="Seu nome" label="Nome" onChange={setName} />
                        <Input type="text" value={lastName} placeholder="Seu sobrenome" label="Sobrenome" onChange={setLastName} />
                        <Input type="date" value={birthDate} placeholder="dd/mm/yyyy" label="Data de nascimento" onChange={setBirthDate} />
                        <Input type="text" value={cpf} placeholder="Seu CPF" label="CPF" onChange={setCpf} maxlength={11}
                minlength={11}/>
                        <Input type="password" value={password} placeholder="Digite sua senha" label="Senha" onChange={setPassword} />
                        <Input type="password" value={passwordVerifier} placeholder="Confirme sua senha" label="Confirmar a senha" onChange={setPasswordVerifier} />
                        <FormButton type="submit">Avançar</FormButton>
                    </Form>
                </>) : (
                <>
                    <Title>Agora suas informações de contato</Title>
                    <Form onSubmit={handleSubmit}>
                        <Input type="text" value={telephone} placeholder="(xx)xxxxx-xxxx" label="Telefone" onChange={setTelephone} />
                        <Input type="text" value={email} placeholder="seuemail@dom.com" label="Email" onChange={setEmail} />
                        <FormButton type="submit">Finalizar</FormButton>
                    </Form>
                </>)}
        </>
    )
}