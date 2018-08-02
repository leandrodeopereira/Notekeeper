package com.leandropereira.notekeeper

//Declared as a objeto to be a singleton
object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        //Primary Constructor -> initialization values
        //Initializer Block -> initialization code
        intializeCourses()
        intializeNotes()
    }

    private fun intializeNotes() {
        var noteInfo = NoteInfo(courses.get("android_intents")!!,
                "Dynamic intent resolution",
                "Wow, intents allow components to be resolved at runtime")
        notes.add(noteInfo)

        noteInfo = NoteInfo(courses.get("android_intents")!!,
                "Delegating intents",
                "Pending intents are powerful; they delegate much more than just a component invocationto be resolved at runtime")
        notes.add(noteInfo)

        noteInfo = NoteInfo(courses.get("android_async")!!,
                "Service default service",
                "Default an Android Service will tie up the UI thread")
        notes.add(noteInfo)

        noteInfo = NoteInfo(courses.get("android_async")!!,
                "Long running operations",
                "Foreground Services can be tied to a notification icon")
        notes.add(noteInfo)

        noteInfo = NoteInfo(courses.get("android_intents")!!,
                "Dynamic intent resolution",
                "Wow, itents allow components to be resolved at runtime")
        notes.add(noteInfo)

        noteInfo = NoteInfo(courses.get("java_lang")!!,
                "Anonymous classes",
                "Anonymous classes simplify implementing one-use types")
        notes.add(noteInfo)

        noteInfo = NoteInfo(courses.get("java_core")!!,
                "Compile options",
                "The -jar option isn't compatible with the -cp option")
        notes.add(noteInfo)

        noteInfo = NoteInfo(courses.get("java_core")!!,
                "Serialization",
                "Remember to include SerialVersionUID to assure version compatibility")
        notes.add(noteInfo)

    }

    private fun intializeCourses(){
        var course = CourseInfo("android_intents", "Android Programming with Intents")
        courses.set(course.courseId, course)

        course = CourseInfo(courseId = "android_async", title = "Android Async Programming and Services")
        courses.set(course.courseId, course)

        course = CourseInfo(title = "Java Fundamentals: The Java Language", courseId = "java_lang")
        courses.set(course.courseId, course)

        course = CourseInfo(title = "Java Fundamentals: The Core Platform", courseId = "java_core")
        courses.set(course.courseId, course)

    }
}