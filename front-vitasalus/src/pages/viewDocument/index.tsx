import Header from "../../components/header2"
import useFetchData from "../../useFetch"
import { useLocation, useSearchParams } from "react-router-dom"
import { Page, HeaderSection, InfoSection, ContentSection, FooterSection, Text, Row } from "./styledComponents"
import { Logo } from "../../components/logo/styledComponent"
import Title from "../../components/title"

export default function ViewDocument() {
    const location = useLocation()
    const { rote } = location.state
    const [searchParams] = useSearchParams()
    const id = searchParams.get("id")

    const { data } = useFetchData({ endpoint: `document/${id}` })

    if (!data) {
        return (
            <>
                <Header href={rote} />
                <p>Carregando dados...</p>
            </>
        )
    }
    return (
        <>
            <Header href={rote} />
            <Page>
                <HeaderSection>
                    <Title>{data.documentType}</Title>
                </HeaderSection>
                <InfoSection>
                    <Row>
                        <Text>ID do documento: {data.id}</Text>
                        <Text>Nome: {data.paciente.nome} {data.paciente.sobrenome}</Text>
                        <Text>Data: {data.date}</Text>
                    </Row>
                    <Row>
                        <Text>CPF: {data.paciente.cpf}</Text>
                        <Text>Médico: {data.medico.nome} CRM {data.medico.crm}</Text>
                    </Row>
                </InfoSection>
                <ContentSection>
                    <Text>{data.description}</Text>
                </ContentSection>
                <FooterSection>
                    <Logo /><p>Vitasalus</p>
                </FooterSection>
            </Page>
        </>
    )
}
