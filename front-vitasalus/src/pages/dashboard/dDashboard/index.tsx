import Header from '../../../components/header'
import {MenuButton} from '../../../components/menuButton/styledComponents'
import { Container } from './styledComponents'
import { CreateModal } from '../../../components/modal'
import { useState } from 'react'

export default function Dashboard(){
    const [isModalOpen, setIsModalOpen] = useState(false)
    const handleOpenModal = () => {
        setIsModalOpen(value => !value)
      }

    return(
        <>
        <Header href='/perfilMedico'/>
        <Container>
        <MenuButton href='/cadastrarDocumento?documentType=Laudo'>Cadastrar Laudo</MenuButton>
        <MenuButton href='/cadastrarDocumento?documentType=Guia'>Cadastrar Guia</MenuButton>
        <MenuButton href='/cadastrarDocumento?documentType=Receita'>Cadastrar Receita</MenuButton>
        <>
        {isModalOpen && <CreateModal closeModal={handleOpenModal}/>}
        <MenuButton onClick={handleOpenModal}>Consultar Guia</MenuButton>
        </>
        </Container>
        </>
    )
}