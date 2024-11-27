export default interface Document{
    documentType: string | null,
    medicoCpf: string | null,
    pacienteCpf: string,
    description: string,
    date: Date
}