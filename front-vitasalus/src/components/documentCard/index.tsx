import { useNavigate } from "react-router-dom"
import { Container, Button } from "./styledComponents"

interface Props {
    doctorName: string,
    doctorLastName: string,
    date: string,
    id: Number

}

export function DocumentCard({ doctorName, date, id, doctorLastName }: Props) {
    const navigate = useNavigate()

    const submit = (rote, id) => {
        navigate(`/documento/?id=${id}`, { state: { rote }})
        
    }
    return (
            <Container>
                <p>{doctorName} {doctorLastName}</p>
                <p>Data: {date}</p>
                <Button onClick={() => submit('/homePaciente', id)}>Abrir</Button>
            </Container>

    )
}