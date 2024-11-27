import { useSearchParams } from "react-router-dom"
import { DocumentCard } from "../../components/documentCard"
import Title from "../../components/title"
import useFetchData from "../../useFetch"
import Header from '../../components/header2'
import { Container } from "./styledComponents"

export default function DocumentsPage(){
    const [searchParams] = useSearchParams()
    const documentType = searchParams.get("documentType")
    const { data } = useFetchData({ endpoint: 
        `document?documentType=${documentType}&cpf=${sessionStorage.getItem('cpf')}` })

    return(
        <>
            <Header href="/homePaciente" />
        <Title>{documentType}s</Title>
        <Container>
        {data?.map(docData => <DocumentCard key={docData.id} doctorName = {docData.medico.nome}  
        date = {docData.date} id={docData.id} doctorLastName={docData.medico.sobrenome}/>)}
        </Container>
        </>
    )
}