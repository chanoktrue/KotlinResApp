package com.trueddns.homenano.resapp

class ResModel {
    var resImage: Int? = null
    var resName: String? = null
    var resDetail: String? = null

    constructor(resImage: Int?, resName: String?, resDetail: String?) {
        this.resImage = resImage
        this.resName = resName
        this.resDetail = resDetail
    }

}