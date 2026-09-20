.class public final Lrv4;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Lc9;

.field public b:Z

.field public c:Z

.field public final d:Law4;

.field public final e:Lmp4;

.field public final f:Lmp4;

.field public final g:Lmp4;


# direct methods
.method public constructor <init>(Lc9;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lrv4;->a:Lc9;

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Lrv4;->c:Z

    .line 8
    .line 9
    new-instance p1, Law4;

    .line 10
    .line 11
    invoke-direct {p1}, Law4;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lrv4;->d:Law4;

    .line 15
    .line 16
    invoke-static {}, Lx75;->a()Lmp4;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lrv4;->e:Lmp4;

    .line 21
    .line 22
    invoke-static {}, Lx75;->a()Lmp4;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lrv4;->f:Lmp4;

    .line 27
    .line 28
    invoke-static {}, Lx75;->a()Lmp4;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lrv4;->g:Lmp4;

    .line 33
    .line 34
    return-void
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

.method public static a(Lrv4;Ltv4;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lrv4;->d()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lrv4;->f:Lmp4;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lmp4;->a(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lrv4;->d:Law4;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object v1, p1, Ltv4;->g:Lrv4;

    .line 24
    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    iget-object v1, v0, Law4;->e:Las;

    .line 28
    .line 29
    invoke-virtual {v1, p1}, Las;->addFirst(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iput-object p0, p1, Ltv4;->g:Lrv4;

    .line 33
    .line 34
    invoke-virtual {v0}, Law4;->b()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    const-string p0, "Handler \'"

    .line 39
    .line 40
    const-string v0, "\' is already registered with a dispatcher"

    .line 41
    .line 42
    invoke-static {p1, v0, p0}, Lku4;->w(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    return-void
    .line 46
    .line 47
.end method


# virtual methods
.method public final b(Lzv4;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lrv4;->d()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lrv4;->g:Lmp4;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lmp4;->a(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lrv4;->d:Law4;

    .line 13
    .line 14
    const/4 v1, -0x1

    .line 15
    invoke-virtual {v0, p0, p1, v1}, Law4;->a(Lrv4;Lzv4;I)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
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

.method public final c(Lo45;I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lrv4;->d()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    if-eq p2, v0, :cond_1

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string p0, "Unsupported priority value: "

    .line 11
    .line 12
    invoke-static {p2, p0}, Lhl6;->k(ILjava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Lh;->j(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    :goto_0
    iget-object v0, p0, Lrv4;->g:Lmp4;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lmp4;->a(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    iget-object v0, p0, Lrv4;->d:Law4;

    .line 29
    .line 30
    invoke-virtual {v0, p0, p1, p2}, Law4;->a(Lrv4;Lzv4;I)V

    .line 31
    .line 32
    .line 33
    :cond_2
    return-void
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

.method public final d()V
    .locals 0

    .line 1
    iget-boolean p0, p0, Lrv4;->b:Z

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "This NavigationEventDispatcher has already been disposed and cannot be used."

    .line 7
    .line 8
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
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

.method public final e(Lzv4;Lqv4;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lrv4;->d()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lrv4;->c:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object p0, p0, Lrv4;->d:Law4;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget v0, p0, Law4;->g:I

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 v0, -0x1

    .line 20
    invoke-virtual {p0, v0}, Law4;->c(I)Ltv4;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iput-object v1, p0, Law4;->f:Ltv4;

    .line 25
    .line 26
    iput v0, p0, Law4;->g:I

    .line 27
    .line 28
    iput-object p1, p0, Law4;->h:Lzv4;

    .line 29
    .line 30
    if-eqz p2, :cond_3

    .line 31
    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    new-instance p1, Ldw4;

    .line 35
    .line 36
    invoke-direct {p1, p2, v0}, Ldw4;-><init>(Lqv4;I)V

    .line 37
    .line 38
    .line 39
    iput-object p1, v1, Ltv4;->d:Lew4;

    .line 40
    .line 41
    invoke-virtual {v1, p2}, Ltv4;->f(Lqv4;)V

    .line 42
    .line 43
    .line 44
    :cond_2
    iget-object p0, p0, Law4;->a:Ld37;

    .line 45
    .line 46
    new-instance p1, Ldw4;

    .line 47
    .line 48
    invoke-direct {p1, p2, v0}, Ldw4;-><init>(Lqv4;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    const/4 p2, 0x0

    .line 55
    invoke-virtual {p0, p2, p1}, Ld37;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    :cond_3
    :goto_0
    return-void
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
