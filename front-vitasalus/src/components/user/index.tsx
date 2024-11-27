interface Props{
    nome: string,
    sobrenome: string, 
    cpf: string,
    email: string,
    crm?: string,
    ufcrm?: string,
    telefone: string,
    dataNascimento: string,
}

export default function User({nome, sobrenome, cpf, email, crm, ufcrm, telefone, dataNascimento}: Props){
    return(
        <>
            <p>Nome: {nome} {sobrenome}</p>
            <p>CPF: {cpf}</p>
            <p>Data de Nascimento: {dataNascimento}</p>
            <p>{crm}</p>
            <p>{ufcrm}</p>
            <p></p>
            <p>Informações de contato</p>
            <p>Email: {email}</p>
            <p>Telefone: {telefone}</p>
        </>
    )
}