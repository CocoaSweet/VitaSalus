import styled from "styled-components"

interface Props {
    children?: React.ReactNode
}

const Text = styled.h2`
font-style: normal;
font-weight: 700;
font-size: 37px;
line-height: 10px;
color: #519790;
margin-top: 20px;
padding: 20px;
text-align: center;
`
export default function Title({children}: Props){
    return(
        <>
        <Text>{children}</Text>
        </>
    )
}