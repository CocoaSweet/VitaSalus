import { styled } from 'styled-components'
import Icon from '../../assets/Profile-PNG-File.png'

export const ProfileIcon = styled.section`
height: 80px;
width: 80px;
background-image: url(${Icon});
background-repeat: no-repeat;
background-size: cover;
margin: 20px;
`
export const Button = styled.a`
color: gray;
font-size: 20px;
font-weight: 700;
`

export const Container = styled.div`
display: flex;
align-items: center;
`