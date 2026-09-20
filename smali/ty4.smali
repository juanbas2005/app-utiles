.class public abstract Lty4;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "(^|.*\\s)datatransport/\\S+ android/($|\\s.*)"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lty4;->a:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    return-void
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

.method public static a(Lorg/apache/http/HttpMessage;)Ljava/lang/Long;
    .locals 2

    .line 1
    :try_start_0
    const-string v0, "content-length"

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lorg/apache/http/HttpMessage;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-interface {p0}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 18
    .line 19
    .line 20
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    return-object p0

    .line 22
    :catch_0
    invoke-static {}, Lrg;->d()Lrg;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string v0, "The content-length value is not a valid number"

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lrg;->a(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    const/4 p0, 0x0

    .line 32
    return-object p0
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
.end method

.method public static b(Lorg/apache/http/HttpResponse;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "content-type"

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-interface {p0}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return-object p0
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

.method public static c(Lsy4;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lsy4;->z:Lpy4;

    .line 2
    .line 3
    iget-object v0, v0, Lqu2;->x:Lcom/google/protobuf/b;

    .line 4
    .line 5
    check-cast v0, Lry4;

    .line 6
    .line 7
    invoke-virtual {v0}, Lry4;->S()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lsy4;->z:Lpy4;

    .line 14
    .line 15
    invoke-virtual {v0}, Lqu2;->h()V

    .line 16
    .line 17
    .line 18
    iget-object v0, v0, Lqu2;->x:Lcom/google/protobuf/b;

    .line 19
    .line 20
    check-cast v0, Lry4;

    .line 21
    .line 22
    invoke-static {v0}, Lry4;->t(Lry4;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {p0}, Lsy4;->b()V

    .line 26
    .line 27
    .line 28
    return-void
    .line 29
.end method
