import { MainContainer, Container } from "./styledComponent"
import { Outlet } from "react-router-dom"

export default function DefaultFormPage(){
    return(
        <MainContainer>
            <Container>
                <Outlet/>
            </Container>
        </MainContainer>
    )
}
