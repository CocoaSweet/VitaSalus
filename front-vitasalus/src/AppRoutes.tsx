import { BrowserRouter, Routes, Route } from "react-router-dom";
import Dashboard from "./pages/dashboard";
import DefaultFormPage from "./pages/defaultFormPage";
import InitialPage from "./pages/initialPage";
import PatientLogin from "./pages/login/patientLogin";
import DoctorLogin from "./pages/login/doctorLogin";
import PatientRegister from "./pages/register/patientRegister";
import DoctorRegister from "./pages/register/doctorRegister";
import DefaultPage from "./pages/defaultPage";

export default function AppRoutes(){
    return(
        <BrowserRouter>
        <Routes>
            <Route path = "/">
            <Route index element={<InitialPage/>}/>
            </Route>
            <Route path = "/" element={<DefaultPage/>}>
                <Route path = "/dashboard" element={<Dashboard/>}/>
            </Route>
            <Route path = "/" element={<DefaultFormPage/>}>
                <Route path = "/loginPaciente" element={<PatientLogin/>}/>
                <Route path = "/loginMedico" element={<DoctorLogin/>}/>
                <Route path = "/cadastroPaciente" element={<PatientRegister/>}/>
                <Route path = "/cadastroMedico" element={<DoctorRegister/>}/>
            </Route>
        </Routes>
        </BrowserRouter>
    )
}