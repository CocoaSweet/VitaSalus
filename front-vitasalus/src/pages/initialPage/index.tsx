import Title from "../../components/title";
import Logo from "./logo";
import { MainContainer, Container } from "./styledComponents"

export default function InitialPage(){
  return(
    <>
    <MainContainer>
        <Container>
            <Logo/>
            <Title>VitaSalus</Title>
        </Container>
    </MainContainer>
    </>
  )
}