/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.ericlab.sondy.core.misc;

import java.util.HashSet;

////////////////////////////////////////////////////////////////////////////////
//  This file is part of SONDY.                                               //
//                                                                            //
//  SONDY is free software: you can redistribute it and/or modify             //
//  it under the terms of the GNU General Public License as published by      //
//  the Free Software Foundation, either version 3 of the License, or         //
//  (at your option) any later version.                                       //
//                                                                            //
//  SONDY is distributed in the hope that it will be useful,                  //
//  but WITHOUT ANY WARRANTY; without even the implied warranty of            //
//  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the             //
//  GNU General Public License for more details.                              //
//                                                                            //
//  You should have received a copy of the GNU General Public License         //
//  along with SONDY.  If not, see <http://www.gnu.org/licenses/>.            //
////////////////////////////////////////////////////////////////////////////////

/**
 *   Class that manages a list of stopwords.
 * 
 *   @author Adrien GUILLE, Laboratoire ERIC, Université Lumière Lyon 2
 */

public class StopWords {

    public HashSet<String> stopWords = new HashSet<>();
    
    /**
     *
     * @return
     */
    public HashSet<String> getSet(){
        return stopWords;
    }
    
    /**
     *
     * @param set
     */
    public void addAll(HashSet<String> set){
        stopWords.addAll(set);
    }
    
    /**
     *
     * @param word
     */
    public void add(String word){
        stopWords.add(word);
    }
}
