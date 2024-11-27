import useFetchData from '../../../useFetch'
import Title from '../../../components/title'
import Header from '../../../components/header2'
import User from '../../../components/user'

export default function Profile() {
    const { data } = useFetchData({ endpoint: `paciente/${sessionStorage.getItem('cpf')}`})

    if (!data) {
        return (
            <>
                <Header href="/homePaciente" />
                <Title>Perfil</Title>
                <p>Carregando dados...</p>
            </>
        )
    }
    return (
        <>
            <Header href="/homePaciente" />
            <Title>Perfil</Title>
            <h2>Dados do Paciente:</h2>
            <User
                nome={data.nome}
                sobrenome={data.sobrenome}
                cpf={data.cpf}
                email={data.email}
                telefone={data.telefone}
                dataNascimento={data.dataNascimento}
            />
        </>
    )
}