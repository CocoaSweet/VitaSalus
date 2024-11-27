import { Button, Container, ProfileIcon } from "./styledComponents";

interface Props{
    href: string,
}

export default function ProfileButton({href}: Props){
    return(
        <Container>
        <ProfileIcon/>
        <Button href={href}>Perfil</Button>
        </Container>
    )
}