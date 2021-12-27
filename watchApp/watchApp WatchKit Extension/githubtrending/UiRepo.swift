//
//  UiRepo.swift
//  watchApp WatchKit Extension
//
//  Created by Anmol Verma on 27/12/21.
//

import Foundation


import Foundation

class UIRepo: Identifiable {
    let author, name: String?
    let avatar: String?
    let url: String?


    init(author: String?, name: String?, avatar: String?, url: String?) {
        self.author = author
        self.name = name
        self.avatar = avatar
        self.url = url
    }
}
