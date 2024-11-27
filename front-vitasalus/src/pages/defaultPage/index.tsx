import { Outlet } from "react-router-dom";
import { styled } from "styled-components";

export const MainContainer = styled.div`
background-color: #FFFAF0;
background-size: cover;
width: 100vw;
height: 100vh;
display: flex;
flex-direction: column;
align-items: center;
overflow-x: hidden;
`

export const Container = styled.div`
background-color: white;
width: 60vw;
height: 100%;
display: flex;
flex-direction: column;
align-items: center;
textAlign: center;
`

export default function DefaultPage(){
    return(
        <>
        <MainContainer>
        <Container>
        <main>
            <Outlet/>
        </main>
        </Container>
        </MainContainer>
        </>
    )
}