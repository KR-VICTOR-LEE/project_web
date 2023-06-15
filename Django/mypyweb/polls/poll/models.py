from django.db import models

class Question(models.Model): #상속관계
    # 필드
    question_text = models.CharField(max_length=200)
    pub_date = models.DateTimeField()

    def __str__(self): # 객체 정보를 문자열로 반환
        return self.question_text
