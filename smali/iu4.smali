.class public final Liu4;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lht4;

.field public final c:Ltb1;

.field public final d:Landroid/app/Activity;

.field public e:Z

.field public final f:Lg30;

.field public final g:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Liu4;->a:Landroid/content/Context;

    .line 8
    .line 9
    new-instance v0, Lht4;

    .line 10
    .line 11
    new-instance v1, Let4;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v1, p0, v2}, Let4;-><init>(Liu4;I)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, p0, v1}, Lht4;-><init>(Liu4;Let4;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Liu4;->b:Lht4;

    .line 21
    .line 22
    new-instance v0, Ltb1;

    .line 23
    .line 24
    invoke-direct {v0, p1, v2}, Ltb1;-><init>(Landroid/content/Context;B)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Liu4;->c:Ltb1;

    .line 28
    .line 29
    new-instance v0, Ltm3;

    .line 30
    .line 31
    const/16 v1, 0x19

    .line 32
    .line 33
    invoke-direct {v0, v1}, Ltm3;-><init>(I)V

    .line 34
    .line 35
    .line 36
    invoke-static {v0, p1}, Lcl6;->S(Lvr2;Ljava/lang/Object;)Lal6;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-interface {p1}, Lal6;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    move-object v1, v0

    .line 55
    check-cast v1, Landroid/content/Context;

    .line 56
    .line 57
    instance-of v1, v1, Landroid/app/Activity;

    .line 58
    .line 59
    if-eqz v1, :cond_0

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    const/4 v0, 0x0

    .line 63
    :goto_0
    check-cast v0, Landroid/app/Activity;

    .line 64
    .line 65
    iput-object v0, p0, Liu4;->d:Landroid/app/Activity;

    .line 66
    .line 67
    new-instance p1, Lg30;

    .line 68
    .line 69
    const/4 v0, 0x2

    .line 70
    invoke-direct {p1, v0, p0}, Lg30;-><init>(ILjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iput-object p1, p0, Liu4;->f:Lg30;

    .line 74
    .line 75
    const/4 p1, 0x1

    .line 76
    iput-boolean p1, p0, Liu4;->g:Z

    .line 77
    .line 78
    iget-object v0, p0, Liu4;->b:Lht4;

    .line 79
    .line 80
    iget-object v0, v0, Lht4;->s:Lox4;

    .line 81
    .line 82
    new-instance v1, Lhu4;

    .line 83
    .line 84
    invoke-direct {v1, v0}, Lhu4;-><init>(Lox4;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, Lox4;->a(Lnx4;)V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Liu4;->b:Lht4;

    .line 91
    .line 92
    iget-object v0, v0, Lht4;->s:Lox4;

    .line 93
    .line 94
    new-instance v1, Ln8;

    .line 95
    .line 96
    iget-object v2, p0, Liu4;->a:Landroid/content/Context;

    .line 97
    .line 98
    invoke-direct {v1, v2}, Ln8;-><init>(Landroid/content/Context;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v1}, Lox4;->a(Lnx4;)V

    .line 102
    .line 103
    .line 104
    new-instance v0, Let4;

    .line 105
    .line 106
    invoke-direct {v0, p0, p1}, Let4;-><init>(Liu4;I)V

    .line 107
    .line 108
    .line 109
    new-instance p0, Lz97;

    .line 110
    .line 111
    invoke-direct {p0, v0}, Lz97;-><init>(Lsr2;)V

    .line 112
    .line 113
    .line 114
    return-void
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
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
.end method

.method public static b(Liu4;Ljava/lang/Object;Lwu4;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Liu4;->b:Lht4;

    .line 8
    .line 9
    invoke-virtual {p0, p1, p2}, Lht4;->l(Ljava/lang/Object;Lwu4;)V

    .line 10
    .line 11
    .line 12
    return-void
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
.method public final a(Lvr2;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Liu4;->b:Lht4;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Luq3;->G(Lvr2;)Lwu4;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p2, p1}, Lht4;->l(Ljava/lang/Object;Lwu4;)V

    .line 14
    .line 15
    .line 16
    return-void
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

.method public final c()V
    .locals 3

    .line 1
    iget-object p0, p0, Liu4;->b:Lht4;

    .line 2
    .line 3
    iget-object v0, p0, Lht4;->f:Las;

    .line 4
    .line 5
    invoke-virtual {v0}, Las;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lht4;->f()Lqt4;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v0, v0, Lqt4;->x:Lao;

    .line 20
    .line 21
    iget v0, v0, Lao;->a:I

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-virtual {p0, v0, v1, v2}, Lht4;->m(IZZ)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0}, Lht4;->b()Z

    .line 32
    .line 33
    .line 34
    :cond_1
    :goto_0
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
.end method
