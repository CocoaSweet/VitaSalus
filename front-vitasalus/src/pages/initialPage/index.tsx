import Button from "../../components/button";
import { Logo } from "../../components/logo/styledComponent";
import Title from "../../components/title";
import { MainContainer, Container } from "./styledComponents"

export default function InitialPage(){
  return(
    <>
    <MainContainer>
        <Container>
            <Logo/>
            <Title>VitaSalus</Title>
            <Button href="/auth/loginPaciente" title="Paciente"/>
            <Button href="/auth/loginMedico" title="Médico"/>
        </Container>
    </MainContainer>
    </>
  )
}