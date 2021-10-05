package org.techtown.manggo_contents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val items = mutableListOf<ContentModel>()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        items.add(
                ContentModel(
                        "https://www.mangoplate.com/",
                        "https://mp-seoul-image-production-s3.mangoplate.com/1182605_1629996625728521.jpg?fit=around|738:738&crop=738:738;*,*&output-format=jpg&output-quality=80",
                        "포비"
                )
        )

        items.add(
                ContentModel(
                        "https://www.mangoplate.com/",
                        "https://mp-seoul-image-production-s3.mangoplate.com/1182605_1629996625728521.jpg?fit=around|738:738&crop=738:738;*,*&output-format=jpg&output-quality=80",
                        "포비"
                )
        )

        items.add(
                ContentModel(
                        "https://www.mangoplate.com/",
                        "https://mp-seoul-image-production-s3.mangoplate.com/1182605_1629996625728521.jpg?fit=around|738:738&crop=738:738;*,*&output-format=jpg&output-quality=80",
                        "포비"
                )
        )

        var recyclerView = findViewById<RecyclerView>(R.id.rv)
        var rvAdater = rvAdapter(items)
        recyclerView.adapter = rvAdater
        //이러면 두줄로된다. (원래는 레이아웃매니저임)
        recyclerView.layoutManager = GridLayoutManager(this,2)

    }
}