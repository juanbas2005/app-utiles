.class public final Lv05;
.super Lgp1;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lad1;


# instance fields
.field public final x:Lfu6;


# direct methods
.method public constructor <init>(Lfu6;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lv05;->x:Lfu6;

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
.method public final A0(Lfu6;)Lgp1;
    .locals 0

    .line 1
    new-instance p0, Lv05;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lv05;-><init>(Lfu6;)V

    .line 4
    .line 5
    .line 6
    return-object p0
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

.method public final Q()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
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
.end method

.method public final t(Lvw3;)Ldu7;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lvw3;->n0()Ldu7;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0}, Liq7;->f(Lvw3;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    invoke-static {p0}, Liq7;->e(Lvw3;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    instance-of p1, p0, Lfu6;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    if-eqz p1, :cond_2

    .line 25
    .line 26
    check-cast p0, Lfu6;

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lfu6;->w0(Z)Lfu6;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p0}, Liq7;->f(Lvw3;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-nez p0, :cond_1

    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_1
    new-instance p0, Lv05;

    .line 40
    .line 41
    invoke-direct {p0, p1}, Lv05;-><init>(Lfu6;)V

    .line 42
    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_2
    instance-of p1, p0, Lzg2;

    .line 46
    .line 47
    if-eqz p1, :cond_5

    .line 48
    .line 49
    move-object p1, p0

    .line 50
    check-cast p1, Lzg2;

    .line 51
    .line 52
    iget-object v1, p1, Lzg2;->x:Lfu6;

    .line 53
    .line 54
    invoke-virtual {v1, v0}, Lfu6;->w0(Z)Lfu6;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-static {v1}, Liq7;->f(Lvw3;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-nez v1, :cond_3

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    new-instance v1, Lv05;

    .line 66
    .line 67
    invoke-direct {v1, v2}, Lv05;-><init>(Lfu6;)V

    .line 68
    .line 69
    .line 70
    move-object v2, v1

    .line 71
    :goto_0
    iget-object p1, p1, Lzg2;->y:Lfu6;

    .line 72
    .line 73
    invoke-virtual {p1, v0}, Lfu6;->w0(Z)Lfu6;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-static {p1}, Liq7;->f(Lvw3;)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-nez p1, :cond_4

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    new-instance p1, Lv05;

    .line 85
    .line 86
    invoke-direct {p1, v0}, Lv05;-><init>(Lfu6;)V

    .line 87
    .line 88
    .line 89
    move-object v0, p1

    .line 90
    :goto_1
    invoke-static {v2, v0}, Lkl8;->n(Lfu6;Lfu6;)Ldu7;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-static {p0}, Lub5;->k(Lvw3;)Lvw3;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-static {p1, p0}, Lub5;->t(Ldu7;Lvw3;)Ldu7;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0

    .line 103
    :cond_5
    invoke-static {}, Lh;->c()V

    .line 104
    .line 105
    .line 106
    const/4 p0, 0x0

    .line 107
    return-object p0
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

.method public final v()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
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
.end method

.method public final v0(Lro7;)Ldu7;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lv05;

    .line 5
    .line 6
    iget-object p0, p0, Lv05;->x:Lfu6;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lfu6;->x0(Lro7;)Lfu6;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-direct {v0, p0}, Lv05;-><init>(Lfu6;)V

    .line 13
    .line 14
    .line 15
    return-object v0
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

.method public final w0(Z)Lfu6;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Lv05;->x:Lfu6;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-virtual {p0, p1}, Lfu6;->w0(Z)Lfu6;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :cond_0
    return-object p0
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

.method public final x0(Lro7;)Lfu6;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lv05;

    .line 5
    .line 6
    iget-object p0, p0, Lv05;->x:Lfu6;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lfu6;->x0(Lro7;)Lfu6;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-direct {v0, p0}, Lv05;-><init>(Lfu6;)V

    .line 13
    .line 14
    .line 15
    return-object v0
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

.method public final y0()Lfu6;
    .locals 0

    .line 1
    iget-object p0, p0, Lv05;->x:Lfu6;

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
