from django.http import HttpResponse
from django.shortcuts import render

def index(request):


    return render(request, 'poll/index.html')

def test(request):
    cart = "계란"
    cartlist = ["계란", "콩나물", "생수"]
    context = {'cart': cart, 'cartlist': cartlist}
    return render(request, 'poll/test.html', context)

