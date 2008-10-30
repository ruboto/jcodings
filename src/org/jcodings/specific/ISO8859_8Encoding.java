/*
 * Permission is hereby granted, free of charge, to any person obtaining a copy of 
 * this software and associated documentation files (the "Software"), to deal in 
 * the Software without restriction, including without limitation the rights to 
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies 
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, 
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE 
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER 
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, 
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE 
 * SOFTWARE.
 */
package org.jcodings.specific;

import org.jcodings.ApplyAllCaseFoldFunction;
import org.jcodings.CaseFoldCodeItem;
import org.jcodings.ISOEncoding;
import org.jcodings.IntHolder;
import org.jcodings.ascii.AsciiTables;

public final class ISO8859_8Encoding extends ISOEncoding {

    protected ISO8859_8Encoding() {
        super(ISO8859_8CtypeTable, AsciiTables.ToLowerCaseTable, null); 
    }
    
    @Override
    public String toString() {
        return "ISO-8859-8";
    }
    
    @Override
    public int mbcCaseFold(int flag, byte[]bytes, IntHolder pp, int end, byte[]lower) {
        return asciiMbcCaseFold(flag, bytes, pp, end, lower);
    }
    
    @Override
    public final byte[]toLowerCaseTable() {
        return LowerCaseTable;
    }
    
    @Override
    public void applyAllCaseFold(int flag, ApplyAllCaseFoldFunction fun, Object arg) {
        asciiApplyAllCaseFold(flag, fun, arg);
    }
    
    @Override
    public CaseFoldCodeItem[]caseFoldCodesByString(int flag, byte[]bytes, int p, int end) {
        return asciiCaseFoldCodesByString(flag, bytes, p, end);
    }    
        
    static final short ISO8859_8CtypeTable[] = {
        0x4008, 0x4008, 0x4008, 0x4008, 0x4008, 0x4008, 0x4008, 0x4008,
        0x4008, 0x420c, 0x4209, 0x4208, 0x4208, 0x4208, 0x4008, 0x4008,
        0x4008, 0x4008, 0x4008, 0x4008, 0x4008, 0x4008, 0x4008, 0x4008,
        0x4008, 0x4008, 0x4008, 0x4008, 0x4008, 0x4008, 0x4008, 0x4008,
        0x4284, 0x41a0, 0x41a0, 0x41a0, 0x41a0, 0x41a0, 0x41a0, 0x41a0,
        0x41a0, 0x41a0, 0x41a0, 0x41a0, 0x41a0, 0x41a0, 0x41a0, 0x41a0,
        0x78b0, 0x78b0, 0x78b0, 0x78b0, 0x78b0, 0x78b0, 0x78b0, 0x78b0,
        0x78b0, 0x78b0, 0x41a0, 0x41a0, 0x41a0, 0x41a0, 0x41a0, 0x41a0,
        0x41a0, 0x7ca2, 0x7ca2, 0x7ca2, 0x7ca2, 0x7ca2, 0x7ca2, 0x74a2,
        0x74a2, 0x74a2, 0x74a2, 0x74a2, 0x74a2, 0x74a2, 0x74a2, 0x74a2,
        0x74a2, 0x74a2, 0x74a2, 0x74a2, 0x74a2, 0x74a2, 0x74a2, 0x74a2,
        0x74a2, 0x74a2, 0x74a2, 0x41a0, 0x41a0, 0x41a0, 0x41a0, 0x51a0,
        0x41a0, 0x78e2, 0x78e2, 0x78e2, 0x78e2, 0x78e2, 0x78e2, 0x70e2,
        0x70e2, 0x70e2, 0x70e2, 0x70e2, 0x70e2, 0x70e2, 0x70e2, 0x70e2,
        0x70e2, 0x70e2, 0x70e2, 0x70e2, 0x70e2, 0x70e2, 0x70e2, 0x70e2,
        0x70e2, 0x70e2, 0x70e2, 0x41a0, 0x41a0, 0x41a0, 0x41a0, 0x4008,
        0x0008, 0x0008, 0x0008, 0x0008, 0x0008, 0x0008, 0x0008, 0x0008,
        0x0008, 0x0008, 0x0008, 0x0008, 0x0008, 0x0008, 0x0008, 0x0008,
        0x0008, 0x0008, 0x0008, 0x0008, 0x0008, 0x0008, 0x0008, 0x0008,
        0x0008, 0x0008, 0x0008, 0x0008, 0x0008, 0x0008, 0x0008, 0x0008,
        0x0284, 0x0000, 0x00a0, 0x00a0, 0x00a0, 0x00a0, 0x00a0, 0x00a0,
        0x00a0, 0x00a0, 0x00a0, 0x01a0, 0x00a0, 0x01a0, 0x00a0, 0x00a0,
        0x00a0, 0x00a0, 0x10a0, 0x10a0, 0x00a0, 0x30e2, 0x00a0, 0x01a0,
        0x00a0, 0x10a0, 0x00a0, 0x01a0, 0x10a0, 0x10a0, 0x10a0, 0x0000,
        0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
        0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
        0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
        0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x01a0,
        0x30a2, 0x30a2, 0x30a2, 0x30a2, 0x30a2, 0x30a2, 0x30a2, 0x30a2,
        0x30a2, 0x30a2, 0x30a2, 0x30a2, 0x30a2, 0x30a2, 0x30a2, 0x30a2,
        0x30a2, 0x30a2, 0x30a2, 0x30a2, 0x30a2, 0x30a2, 0x30a2, 0x30a2,
        0x30a2, 0x30a2, 0x30a2, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000
    };

    public static final ISO8859_8Encoding INSTANCE = new ISO8859_8Encoding();
}
