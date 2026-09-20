.class public final Ly53;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lh53;


# instance fields
.field public final a:Lyr7;

.field public b:Li53;

.field public final c:Ldz2;

.field public d:Ljava/lang/Object;

.field public e:Lw77;

.field public final f:Liz0;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lyr7;

    .line 5
    .line 6
    invoke-direct {v0}, Lyr7;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ly53;->a:Lyr7;

    .line 10
    .line 11
    sget-object v0, Li53;->b:Li53;

    .line 12
    .line 13
    iput-object v0, p0, Ly53;->b:Li53;

    .line 14
    .line 15
    new-instance v0, Ldz2;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, v1}, Ldz2;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Ly53;->c:Ldz2;

    .line 22
    .line 23
    sget-object v0, Lw32;->a:Lw32;

    .line 24
    .line 25
    iput-object v0, p0, Ly53;->d:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lb85;->d()Lw77;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Ly53;->e:Lw77;

    .line 32
    .line 33
    new-instance v0, Liz0;

    .line 34
    .line 35
    invoke-direct {v0}, Liz0;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Ly53;->f:Liz0;

    .line 39
    .line 40
    return-void
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


# virtual methods
.method public final a()Ldz2;
    .locals 0

    .line 1
    iget-object p0, p0, Ly53;->c:Ldz2;

    .line 2
    .line 3
    return-object p0
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
.end method

.method public final b(Lfp7;)V
    .locals 1

    .line 1
    iget-object p0, p0, Ly53;->f:Liz0;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    sget-object v0, Lg56;->a:Lau;

    .line 6
    .line 7
    invoke-virtual {p0, v0, p1}, Liz0;->e(Lau;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    sget-object p1, Lg56;->a:Lau;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Liz0;->c()Ljava/util/Map;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-interface {p0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    return-void
    .line 27
    .line 28
    .line 29
.end method

.method public final c(Ly63;)V
    .locals 3

    .line 1
    sget-object v0, Lu43;->a:Lau;

    .line 2
    .line 3
    new-instance v1, Lnf1;

    .line 4
    .line 5
    const/16 v2, 0x1c

    .line 6
    .line 7
    invoke-direct {v1, v2}, Lnf1;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Ly53;->f:Liz0;

    .line 11
    .line 12
    invoke-virtual {p0, v0, v1}, Liz0;->a(Lau;Lsr2;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ljava/util/Map;

    .line 17
    .line 18
    sget-object v0, Lx63;->a:Lx63;

    .line 19
    .line 20
    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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
.end method

.method public final d(Li53;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly53;->b:Li53;

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

.method public final e(Ly53;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Ly53;->b:Li53;

    .line 5
    .line 6
    iput-object v0, p0, Ly53;->b:Li53;

    .line 7
    .line 8
    iget-object v0, p1, Ly53;->d:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object v0, p0, Ly53;->d:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v0, p1, Ly53;->f:Liz0;

    .line 13
    .line 14
    sget-object v1, Lg56;->a:Lau;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Liz0;->d(Lau;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lfp7;

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Ly53;->b(Lfp7;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p1, Ly53;->a:Lyr7;

    .line 26
    .line 27
    iget-object v2, p0, Ly53;->a:Lyr7;

    .line 28
    .line 29
    invoke-static {v2, v1}, Lj45;->u(Lyr7;Lyr7;)V

    .line 30
    .line 31
    .line 32
    iget-object v1, v2, Lyr7;->h:Ljava/util/List;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iput-object v1, v2, Lyr7;->h:Ljava/util/List;

    .line 38
    .line 39
    iget-object v1, p0, Ly53;->c:Ldz2;

    .line 40
    .line 41
    iget-object p1, p1, Ly53;->c:Ldz2;

    .line 42
    .line 43
    invoke-static {v1, p1}, Lo55;->b(La57;La57;)V

    .line 44
    .line 45
    .line 46
    iget-object p0, p0, Ly53;->f:Liz0;

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Liz0;->c()Ljava/util/Map;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    check-cast p1, Ljava/lang/Iterable;

    .line 63
    .line 64
    invoke-static {p1}, Ldt0;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_0

    .line 77
    .line 78
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    check-cast v1, Lau;

    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, Liz0;->b(Lau;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {p0, v1, v2}, Liz0;->e(Lau;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_0
    return-void
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
