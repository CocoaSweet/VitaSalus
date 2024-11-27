import { BrowserRouter, Routes, Route } from "react-router-dom";
import Dashboard from "./pages/dashboard/dDashboard";
import PDashboard from "./pages/dashboard/pDashboard";
import DefaultFormPage from "./pages/defaultFormPage";
import InitialPage from "./pages/initialPage";
import PatientLogin from "./pages/login/patientLogin";
import DoctorLogin from "./pages/login/doctorLogin";
import PatientRegister from "./pages/register/patientRegister";
import DoctorRegister from "./pages/register/doctorRegister";
import DefaultPage from "./pages/defaultPage";
import DoctorProfile from "./pages/profile/doctorProfile"
import PatientProfile from "./pages/profile/patientProfile"
import Documents from "./pages/documentsPage"
import Document from "./pages/viewDocument"
import CreateDocument from "./pages/createDocument";

export default function AppRoutes(){
    return(
        <BrowserRouter>
        <Routes>
            <Route path = "/">
            <Route index element={<InitialPage/>}/>
            </Route>
            <Route path = "/" element={<DefaultPage/>}>
                <Route path = "/homeMedico" element={<Dashboard/>}/>
                <Route path = "/homePaciente" element={<PDashboard/>}/>
                <Route path = "/perfilMedico" element={<DoctorProfile/>}/>
                <Route path = "/perfilPaciente" element={<PatientProfile/>}/>
                <Route path = "/documentos" element={<Documents/>}/>
                <Route path = "/documento" element={<Document/>}/>
                <Route path = "/cadastrarDocumento" element={<CreateDocument/>}/>
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