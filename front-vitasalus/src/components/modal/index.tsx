import { useEffect, useState } from "react"
import './style.css'
import { useNavigate } from "react-router-dom"

interface InputProps{
     label: string,
     id: number,
     type: string,
     name?: string
     onChange: (idS: any)=> void
}

interface ModalProps{
    closeModal() : void
}

const Input = ({label, id, onChange, type, name}: InputProps) => {
    return(
        <>
            <label>{label}</label>
            <input type={type} value={id} name={name} onChange={content => onChange(content.target.value)}></input>
        </>
    )
}


export function CreateModal({closeModal}: ModalProps){
    const[id, setId] = useState(0)
    const navigate = useNavigate()

    
    const submit = (rote, id) => {
        navigate(`/documento/?id=${id}`, { state: { rote }})
        useEffect(() => {
            if(id != 0){
                closeModal()}
        })
    }
    

    return(
        <div className="modal-overlay">
            <div className="modal-body">
                    <h2>Insira o ID da guia</h2>
                    <form className="form-field">
                        <Input label="ID" type="text" id={id} onChange={setId}/>
                    </form>
                        
                    <button onClick={() => submit('/homeMedico', id)} className="button-modal">Pesquisar</button>
            </div>
        </div>
    )
}