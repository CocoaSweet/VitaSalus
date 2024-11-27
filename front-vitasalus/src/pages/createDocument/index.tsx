import { useState } from "react"
import UsePost from "../../usePost"
import { useNavigate, useSearchParams } from "react-router-dom"
import Document from "../../types/Document"
import Title from "../../components/title"
import Header from '../../components/header2'
import { Form, FormButton } from "../../components/form/styledComponents"
import Input2 from "../../components/input2"
import Input from "../../components/input"
import { Container } from "./styledComponents"

export default function CreateDocument() {
    const [searchParams] = useSearchParams()
    const documentType = searchParams.get("documentType")
    const [doctorCpf] = useState(sessionStorage.getItem('cpf'))
    const [patientCpf, setPatientCpf] = useState('')
    const [description, setDescription] = useState('')
    const [docCreationDate] = useState(new Date())
    const { mutate, isSuccess } = UsePost()
    const navigate = useNavigate()

    const handleLogin = async (event: React.FormEvent<HTMLElement>) => {
        event.preventDefault()

        const document: Document = {

            documentType: documentType,
            medicoCpf: doctorCpf,
            pacienteCpf: patientCpf,
            description: description,
            date: docCreationDate
        }

        try {
            mutate({
                endpoint: 'document/new-doc',
                data: document
            })
            navigate('/homeMedico')

        } catch { [isSuccess] && alert('Não foi possível cadastrar o documento') }
    }
    return (

        <>
            <Header href="/homeMedico" />
            <Title>Criar {documentType}</Title>
            <Container>
                <Form onSubmit={handleLogin}>
                <p>Data: {docCreationDate.toLocaleDateString()}</p>
                    <Input type="text" value={patientCpf} placeholder="999999999xx" label="CPF do paciente" onChange={setPatientCpf}/>
                    <Input2 value={description} placeholder={`Descreva o ${documentType}`} label="Descrição do laudo" onChange={setDescription} />
                    <FormButton type="submit">Cadastrar {documentType}</FormButton>
                </Form>
            </Container>
        </>
    )
}