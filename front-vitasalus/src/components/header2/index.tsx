import styled from 'styled-components'
import { Logo } from "../logo/styledComponent"
import authStore from '../../store/auth.store'

const StyledHeader = styled.header`
    display: flex;
    align-items: center;
    justify-content: space-between;
    padding: 2em 4em;
    background-color: white;
    width: 92.5vw;
    height: 10vh;
`

const Container = styled.div`
    display: flex;
    align-items: center;
    justify-content: space-around;
    flex-grow: .1;
`

const Pressable = styled.a`
background-color: #25AB48;
border-radius: 8px;
padding: 12px 16px;
width: 30%;
color: var(--branco);
border: none;
margin: 10px;
font-weight: 700;
line-height: 19px;
textAlign: 'center';
text-decoration: none;
display: inline-block;
color: Ivory;
`
interface Props {
    href: string,
}

export default function Header({ href }: Props) {
    const handleLogout = () => {
        authStore.logout()
    }

    return (
        <StyledHeader>
            <Container>
                <Pressable href={href}>Voltar</Pressable>
            </Container>
            <Logo />
            <Container>
                <Pressable href='/' onClick={handleLogout}>Sair</Pressable>
            </Container>
        </StyledHeader>
    )
}
