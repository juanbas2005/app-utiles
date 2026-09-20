.class public final Lae3;
.super Ljava/net/HttpURLConnection;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Lce3;


# direct methods
.method public constructor <init>(Ljava/net/HttpURLConnection;Lui7;Lsy4;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, Ljava/net/HttpURLConnection;-><init>(Ljava/net/URL;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lce3;

    .line 9
    .line 10
    invoke-direct {v0, p1, p2, p3}, Lce3;-><init>(Ljava/net/HttpURLConnection;Lui7;Lsy4;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lae3;->a:Lce3;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
.end method


# virtual methods
.method public final addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public final connect()V
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lce3;->a()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final disconnect()V
    .locals 3

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    iget-object v0, p0, Lce3;->b:Lsy4;

    .line 4
    .line 5
    iget-object v1, p0, Lce3;->e:Lui7;

    .line 6
    .line 7
    invoke-virtual {v1}, Lui7;->b()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    invoke-virtual {v0, v1, v2}, Lsy4;->i(J)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lsy4;->b()V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final getAllowUserInteraction()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/net/URLConnection;->getAllowUserInteraction()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getConnectTimeout()I
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/net/URLConnection;->getConnectTimeout()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getContent()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lce3;->b()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getContent([Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0

    .line 8
    iget-object p0, p0, Lae3;->a:Lce3;

    invoke-virtual {p0, p1}, Lce3;->c([Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final getContentEncoding()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lce3;->i()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/net/URLConnection;->getContentEncoding()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getContentLength()I
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lce3;->i()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/net/URLConnection;->getContentLength()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getContentLengthLong()J
    .locals 2

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lce3;->i()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/net/URLConnection;->getContentLengthLong()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getContentType()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lce3;->i()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getDate()J
    .locals 2

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lce3;->i()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/net/URLConnection;->getDate()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getDefaultUseCaches()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/net/URLConnection;->getDefaultUseCaches()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getDoInput()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/net/URLConnection;->getDoInput()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getDoOutput()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/net/URLConnection;->getDoOutput()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getErrorStream()Ljava/io/InputStream;
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lce3;->d()Ljava/io/InputStream;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getExpiration()J
    .locals 2

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lce3;->i()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/net/URLConnection;->getExpiration()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getHeaderField(I)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lce3;->i()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ljava/net/HttpURLConnection;->getHeaderField(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final getHeaderField(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 13
    iget-object p0, p0, Lae3;->a:Lce3;

    invoke-virtual {p0}, Lce3;->i()V

    .line 14
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    invoke-virtual {p0, p1}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final getHeaderFieldDate(Ljava/lang/String;J)J
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lce3;->i()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2, p3}, Ljava/net/HttpURLConnection;->getHeaderFieldDate(Ljava/lang/String;J)J

    .line 9
    .line 10
    .line 11
    move-result-wide p0

    .line 12
    return-wide p0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public final getHeaderFieldInt(Ljava/lang/String;I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lce3;->i()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, Ljava/net/URLConnection;->getHeaderFieldInt(Ljava/lang/String;I)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public final getHeaderFieldKey(I)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lce3;->i()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ljava/net/HttpURLConnection;->getHeaderFieldKey(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final getHeaderFieldLong(Ljava/lang/String;J)J
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lce3;->i()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2, p3}, Ljava/net/URLConnection;->getHeaderFieldLong(Ljava/lang/String;J)J

    .line 9
    .line 10
    .line 11
    move-result-wide p0

    .line 12
    return-wide p0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public final getHeaderFields()Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lce3;->i()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getIfModifiedSince()J
    .locals 2

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/net/URLConnection;->getIfModifiedSince()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getInputStream()Ljava/io/InputStream;
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lce3;->e()Ljava/io/InputStream;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getInstanceFollowRedirects()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getInstanceFollowRedirects()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getLastModified()J
    .locals 2

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lce3;->i()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/net/URLConnection;->getLastModified()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getOutputStream()Ljava/io/OutputStream;
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lce3;->f()Ljava/io/OutputStream;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getPermission()Ljava/security/Permission;
    .locals 2

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    iget-object v0, p0, Lce3;->b:Lsy4;

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getPermission()Ljava/security/Permission;

    .line 8
    .line 9
    .line 10
    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    return-object p0

    .line 12
    :catch_0
    move-exception v1

    .line 13
    iget-object p0, p0, Lce3;->e:Lui7;

    .line 14
    .line 15
    invoke-static {p0, v0, v0}, Lf21;->t(Lui7;Lsy4;Lsy4;)V

    .line 16
    .line 17
    .line 18
    throw v1
    .line 19
    .line 20
    .line 21
.end method

.method public final getReadTimeout()I
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/net/URLConnection;->getReadTimeout()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getRequestMethod()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getRequestMethod()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getRequestProperties()Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/net/URLConnection;->getRequestProperties()Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getRequestProperty(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/net/URLConnection;->getRequestProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final getResponseCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lce3;->g()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getResponseMessage()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lce3;->h()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getURL()Ljava/net/URL;
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getUseCaches()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/net/URLConnection;->getUseCaches()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final setAllowUserInteraction(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/net/URLConnection;->setAllowUserInteraction(Z)V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final setChunkedStreamingMode(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/net/HttpURLConnection;->setChunkedStreamingMode(I)V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final setConnectTimeout(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final setDefaultUseCaches(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/net/URLConnection;->setDefaultUseCaches(Z)V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final setDoInput(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final setDoOutput(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final setFixedLengthStreamingMode(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final setFixedLengthStreamingMode(J)V
    .locals 0

    .line 9
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 10
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 11
    invoke-virtual {p0, p1, p2}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(J)V

    return-void
.end method

.method public final setIfModifiedSince(J)V
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Ljava/net/URLConnection;->setIfModifiedSince(J)V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final setInstanceFollowRedirects(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final setReadTimeout(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final setRequestMethod(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v0, "User-Agent"

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lce3;->b:Lsy4;

    .line 15
    .line 16
    iput-object p2, v0, Lsy4;->B:Ljava/lang/String;

    .line 17
    .line 18
    :cond_0
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 19
    .line 20
    invoke-virtual {p0, p1, p2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public final setUseCaches(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final usingProxy()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lae3;->a:Lce3;

    .line 2
    .line 3
    iget-object p0, p0, Lce3;->a:Ljava/net/HttpURLConnection;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->usingProxy()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
