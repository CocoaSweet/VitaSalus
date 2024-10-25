import styled from "styled-components"

interface Props {
    children?: React.ReactNode
}

const Text = styled.h2`
font-family: var(--fonte-principal);
font-style: normal;
font-weight: 700;
font-size: 37px;
line-height: 10px;
color: #519790;
`
export default function Title({children}: Props){
    return(
        <>
        <Text>{children}</Text>
        </>
    )
}