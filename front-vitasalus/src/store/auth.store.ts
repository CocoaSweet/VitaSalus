import { makeObservable, observable, action } from "mobx";
import UserAuth from "../types/UserAuth";

class AuthStore {
    isAuthenticated = false
    user: UserAuth = {cpf: "", token: ""}

    constructor(){
        makeObservable(this, {
            isAuthenticated: observable,
            user: observable,
            login: action,
            logout: action
        })
    }

    login({cpf, token}: UserAuth){
        this.isAuthenticated = true
        this.user = {cpf, token}
    }

    logout(){
        this.isAuthenticated = false
        this.user = {cpf: "", token: ""}
    }

}

export const authStore = new AuthStore()