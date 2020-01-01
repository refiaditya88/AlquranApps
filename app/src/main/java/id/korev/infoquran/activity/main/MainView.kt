package id.korev.infoquran.activity.main


import id.korev.infoquran.model.Surat


interface MainView {
    fun showLoading()
    fun onRespone(hasil: ArrayList<Surat>?)
    fun onError(message: String?)
    fun hideLoading()
}