.class public final Lci4;
.super Ljava/lang/Object;

# interfaces
.implements Lsr2;


# instance fields
.field public final w:Lei4;

.field public final x:Z

.field public final y:Lqs5;


# direct methods
.method public constructor <init>(Lei4;ZLqs5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lci4;->w:Lei4;

    .line 5
    .line 6
    iput-boolean p2, p0, Lci4;->x:Z

    .line 7
    .line 8
    iput-object p3, p0, Lci4;->y:Lqs5;

    .line 9
    .line 10
    return-void
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
.method public final b()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lci4;->w:Lei4;

    .line 2
    .line 3
    iget-object v1, v0, Lei4;->a:Lz00;

    .line 4
    .line 5
    iget-object v2, v1, Lz00;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lvj1;

    .line 8
    .line 9
    invoke-virtual {v0, v2}, Lei4;->a(Lvj1;)Lst5;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v1, v1, Lz00;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lws1;

    .line 18
    .line 19
    iget-boolean v2, p0, Lci4;->x:Z

    .line 20
    .line 21
    iget-object p0, p0, Lci4;->y:Lqs5;

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    iget-object v1, v1, Lws1;->e:Lzl;

    .line 26
    .line 27
    invoke-interface {v1, v0, p0}, Lim;->f(Lst5;Lqs5;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, Ldt0;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object v1, v1, Lws1;->e:Lzl;

    .line 37
    .line 38
    invoke-interface {v1, v0, p0}, Lim;->o(Lst5;Lqs5;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, Ldt0;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/4 p0, 0x0

    .line 48
    :goto_0
    if-nez p0, :cond_2

    .line 49
    .line 50
    sget-object p0, La42;->w:La42;

    .line 51
    .line 52
    :cond_2
    return-object p0
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
