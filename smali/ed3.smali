.class public final Led3;
.super Lus0;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/lang/Runnable;
.implements Ll45;
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public A:Z

.field public B:Ldb8;

.field public final y:Lib8;

.field public z:Z


# direct methods
.method public constructor <init>(Lib8;)V
    .locals 1

    .line 1
    iget-boolean v0, p1, Lib8;->t:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lus0;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Led3;->y:Lib8;

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
.end method


# virtual methods
.method public final d(Lha8;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Led3;->z:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Led3;->A:Z

    .line 5
    .line 6
    iget-object v0, p0, Led3;->B:Ldb8;

    .line 7
    .line 8
    iget-object p1, p1, Lha8;->a:Lga8;

    .line 9
    .line 10
    invoke-virtual {p1}, Lga8;->a()J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    const-wide/16 v3, 0x0

    .line 15
    .line 16
    cmp-long p1, v1, v3

    .line 17
    .line 18
    if-lez p1, :cond_0

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object p1, v0, Ldb8;->a:Lza8;

    .line 23
    .line 24
    iget-object v1, p0, Led3;->y:Lib8;

    .line 25
    .line 26
    iget-object v2, v1, Lib8;->s:Ld28;

    .line 27
    .line 28
    const/16 v3, 0x8

    .line 29
    .line 30
    invoke-virtual {p1, v3}, Lza8;->h(I)Lad3;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-static {v4}, Li75;->o(Lad3;)Ljd3;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v2, v4}, Ld28;->f(Ljd3;)V

    .line 39
    .line 40
    .line 41
    iget-object v2, v1, Lib8;->r:Ld28;

    .line 42
    .line 43
    invoke-virtual {p1, v3}, Lza8;->h(I)Lad3;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {p1}, Li75;->o(Lad3;)Ljd3;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {v2, p1}, Ld28;->f(Ljd3;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v1, v0}, Lib8;->b(Lib8;Ldb8;)V

    .line 55
    .line 56
    .line 57
    :cond_0
    const/4 p1, 0x0

    .line 58
    iput-object p1, p0, Led3;->B:Ldb8;

    .line 59
    .line 60
    return-void
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

.method public final e(Lha8;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Led3;->z:Z

    .line 3
    .line 4
    iput-boolean p1, p0, Led3;->A:Z

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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final f(Ldb8;Ljava/util/List;)Ldb8;
    .locals 0

    .line 1
    iget-object p0, p0, Led3;->y:Lib8;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lib8;->b(Lib8;Ldb8;)V

    .line 4
    .line 5
    .line 6
    iget-boolean p0, p0, Lib8;->t:Z

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    sget-object p0, Ldb8;->b:Ldb8;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    return-object p1
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

.method public final g(Lha8;Lk68;)Lk68;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Led3;->z:Z

    .line 3
    .line 4
    return-object p2
    .line 5
    .line 6
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

.method public final i(Landroid/view/View;Ldb8;)Ldb8;
    .locals 5

    .line 1
    iput-object p2, p0, Led3;->B:Ldb8;

    .line 2
    .line 3
    iget-object v0, p0, Led3;->y:Lib8;

    .line 4
    .line 5
    iget-object v1, v0, Lib8;->r:Ld28;

    .line 6
    .line 7
    iget-object v2, p2, Ldb8;->a:Lza8;

    .line 8
    .line 9
    const/16 v3, 0x8

    .line 10
    .line 11
    invoke-virtual {v2, v3}, Lza8;->h(I)Lad3;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-static {v4}, Li75;->o(Lad3;)Ljd3;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {v1, v4}, Ld28;->f(Ljd3;)V

    .line 20
    .line 21
    .line 22
    iget-boolean v1, p0, Led3;->z:Z

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 27
    .line 28
    const/16 v2, 0x1e

    .line 29
    .line 30
    if-ne v1, v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-boolean p0, p0, Led3;->A:Z

    .line 37
    .line 38
    if-nez p0, :cond_1

    .line 39
    .line 40
    iget-object p0, v0, Lib8;->s:Ld28;

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Lza8;->h(I)Lad3;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {p1}, Li75;->o(Lad3;)Ljd3;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p0, p1}, Ld28;->f(Ljd3;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v0, p2}, Lib8;->b(Lib8;Ldb8;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    :goto_0
    iget-boolean p0, v0, Lib8;->t:Z

    .line 57
    .line 58
    if-eqz p0, :cond_2

    .line 59
    .line 60
    sget-object p0, Ldb8;->b:Ldb8;

    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_2
    return-object p2
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
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->requestApplyInsets()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final run()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Led3;->z:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Led3;->z:Z

    .line 7
    .line 8
    iput-boolean v0, p0, Led3;->A:Z

    .line 9
    .line 10
    iget-object v0, p0, Led3;->B:Ldb8;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, Led3;->y:Lib8;

    .line 15
    .line 16
    iget-object v2, v1, Lib8;->s:Ld28;

    .line 17
    .line 18
    const/16 v3, 0x8

    .line 19
    .line 20
    iget-object v4, v0, Ldb8;->a:Lza8;

    .line 21
    .line 22
    invoke-virtual {v4, v3}, Lza8;->h(I)Lad3;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-static {v3}, Li75;->o(Lad3;)Ljd3;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v2, v3}, Ld28;->f(Ljd3;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v1, v0}, Lib8;->b(Lib8;Ldb8;)V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    iput-object v0, p0, Led3;->B:Ldb8;

    .line 38
    .line 39
    :cond_0
    return-void
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
