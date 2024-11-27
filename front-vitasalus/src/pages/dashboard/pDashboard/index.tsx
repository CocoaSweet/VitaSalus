import Header from '../../../components/header'
import { MenuButton } from '../../../components/menuButton/styledComponents'
import { Container } from './styledComponent'

export default function Dashboard() {
    
    return (
        <>
            <Header href='/perfilPaciente' />
            <Container>
                <MenuButton href='/documentos?documentType=Laudo'>Consultar Laudo</MenuButton>
                <MenuButton href='/documentos?documentType=Guia'>Consultar Guia</MenuButton>
                <MenuButton href='/documentos?documentType=Receita'>Consultar Receita</MenuButton>
                <MenuButton href='/consultarAlarmes'>Consultar Alarmes</MenuButton>
            </Container>
        </>
    )
}