package com.nsh.dtq.utils

import com.nsh.dtq.entity.ChoiceQuestion
import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import org.json.JSONObject
import java.io.File
import java.io.FileOutputStream
import java.io.IOException

object NetUtils
{
    val JSON = MediaType.parse("application/json; charset=utf-8")
    val addUrl = ""
    val deleteUrl = ""
    val updateUrl = ""
    val queryUrl = ""
    val downloadUrl = ""
    val dirPath = ""
    val fileName = ""
    val mClient = OkHttpClient()
    fun addQuestion(time : Int, bean : ChoiceQuestion) : String
    {
        val requestBody = RequestBody.create(JSON,"json")
        val request = Request.Builder().url(addUrl).post(requestBody).build()
        val response = mClient.newCall(request).execute()
        if(response.isSuccessful)
        {
            return response.body()?.string() ?: ""
        }
        else
        {
            throw IOException("Unexpected code" + response)
        }
    }

    fun deleteQuestion(time : Int) : String
    {
        val request = Request.Builder().url(deleteUrl).build()
        val response = mClient.newCall(request).execute()
        if(response.isSuccessful)
        {
            return response.body()?.string() ?: ""
        }
        else
        {
            throw IOException("Unexpected code" + response)
        }
    }

    fun download(time : Int) : File
    {
        val request = Request.Builder().url(downloadUrl).build()
        val response = mClient.newCall(request).execute()
        if(response.isSuccessful)
        {
            val inStream = response.body()?.byteStream() ?: throw IOException("null inStream")
            val dir = File(dirPath)
            if(!dir.exists())
            {
                dir.mkdirs()
            }
            val file = File(dirPath, fileName)
            val fos = FileOutputStream(file)
            val buf = ByteArray(1024*8)
            var len: Int
            while(true)
            {
                len = inStream.read(buf)
                if(-1 == len)
                {
                    break
                }
                fos.write(buf,0,len)
            }
            fos.flush()
            return file
        }
        else
        {
            throw IOException("Unexpected code" + response)
        }
    }
}