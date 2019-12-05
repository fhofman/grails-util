List.metaClass.first { l -> 
  def ret = []
  l.times{
    ret << delegate[it]
  }
ret
}

Map.metaClass.first { l -> 
  def ret = [:]
  l.times{
    def k = delegate.keySet()[it]
    def v = delegate[k]
    ret[k]=v
  }
ret
}

 [1,2,3,4,5].first(3)
 ['a':1,'b':33,'d':'aa',4:'AA',5:5].first(3)

