/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rizqyanandar.latihanmvcjdbc.event;

import edu.rizqyanandar.latihanmvcjdbc.entity.Pelanggan;
import edu.rizqyanandar.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author Administrator
 * Nama     : Rizqy Ananda Rusmana
 * NIM      : 10119906
 * Kelas    : IF-10K
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    public void onUpdate(Pelanggan pelanggan);
    public void onDelete();
    public void onInsert(Pelanggan pelanggan);
    
}
