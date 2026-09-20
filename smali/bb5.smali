.class public final Lbb5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lh24;


# instance fields
.field public final a:Lob5;

.field public final b:Luq3;

.field public final c:Lig;


# direct methods
.method public constructor <init>(Lob5;Lab5;Lig;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbb5;->a:Lob5;

    .line 5
    .line 6
    iput-object p2, p0, Lbb5;->b:Luq3;

    .line 7
    .line 8
    iput-object p3, p0, Lbb5;->c:Lig;

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
.method public final a()I
    .locals 0

    .line 1
    iget-object p0, p0, Lbb5;->b:Luq3;

    .line 2
    .line 3
    invoke-virtual {p0}, Luq3;->x()Lig;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget p0, p0, Lig;->b:I

    .line 8
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

.method public final b(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lbb5;->c:Lig;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lig;->g(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lbb5;->b:Luq3;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Luq3;->y(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    return-object v0
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

.method public final d(ILjava/lang/Object;Lyt2;I)V
    .locals 8

    .line 1
    const v0, -0x479b9c4d

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3, v0}, Lyt2;->g0(I)Lyt2;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3, p1}, Lyt2;->e(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v3, 0x4

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    move v0, v3

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x2

    .line 17
    :goto_0
    or-int/2addr v0, p4

    .line 18
    invoke-virtual {p3, p2}, Lyt2;->i(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    if-eqz v5, :cond_1

    .line 23
    .line 24
    const/16 v5, 0x20

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/16 v5, 0x10

    .line 28
    .line 29
    :goto_1
    or-int/2addr v0, v5

    .line 30
    invoke-virtual {p3, p0}, Lyt2;->g(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_2

    .line 35
    .line 36
    const/16 v5, 0x100

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    const/16 v5, 0x80

    .line 40
    .line 41
    :goto_2
    or-int/2addr v0, v5

    .line 42
    and-int/lit16 v5, v0, 0x93

    .line 43
    .line 44
    const/16 v7, 0x92

    .line 45
    .line 46
    if-eq v5, v7, :cond_3

    .line 47
    .line 48
    const/4 v5, 0x1

    .line 49
    goto :goto_3

    .line 50
    :cond_3
    const/4 v5, 0x0

    .line 51
    :goto_3
    and-int/lit8 v7, v0, 0x1

    .line 52
    .line 53
    invoke-virtual {p3, v7, v5}, Lyt2;->V(IZ)Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_4

    .line 58
    .line 59
    iget-object v5, p0, Lbb5;->a:Lob5;

    .line 60
    .line 61
    iget-object v5, v5, Lob5;->z:Lq24;

    .line 62
    .line 63
    new-instance v7, Lob3;

    .line 64
    .line 65
    invoke-direct {v7, p1, v3, p0}, Lob3;-><init>(IILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    const v3, 0x441527a7

    .line 69
    .line 70
    .line 71
    invoke-static {v3, v7, p3}, Lsu0;->J(ILds2;Lyt2;)Lfw0;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    shr-int/lit8 v7, v0, 0x3

    .line 76
    .line 77
    and-int/lit8 v7, v7, 0xe

    .line 78
    .line 79
    or-int/lit16 v7, v7, 0xc00

    .line 80
    .line 81
    shl-int/lit8 v0, v0, 0x3

    .line 82
    .line 83
    and-int/lit8 v0, v0, 0x70

    .line 84
    .line 85
    or-int/2addr v7, v0

    .line 86
    move-object v2, p2

    .line 87
    move-object v6, p3

    .line 88
    move-object v4, v5

    .line 89
    move-object v5, v3

    .line 90
    move v3, p1

    .line 91
    invoke-static/range {v2 .. v7}, Lar7;->d(Ljava/lang/Object;ILq24;Lfw0;Lyt2;I)V

    .line 92
    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_4
    invoke-virtual {p3}, Lyt2;->Y()V

    .line 96
    .line 97
    .line 98
    :goto_4
    invoke-virtual {p3}, Lyt2;->v()Lyx5;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    if-eqz v6, :cond_5

    .line 103
    .line 104
    new-instance v0, Ldj7;

    .line 105
    .line 106
    const/16 v5, 0xc

    .line 107
    .line 108
    move-object v1, p0

    .line 109
    move v2, p1

    .line 110
    move-object v3, p2

    .line 111
    move v4, p4

    .line 112
    invoke-direct/range {v0 .. v5}, Ldj7;-><init>(Lh24;ILjava/lang/Object;II)V

    .line 113
    .line 114
    .line 115
    iput-object v0, v6, Lyx5;->d:Lgs2;

    .line 116
    .line 117
    :cond_5
    return-void
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
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method

.method public final e(Ljava/lang/Object;)I
    .locals 0

    .line 1
    iget-object p0, p0, Lbb5;->c:Lig;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lig;->f(Ljava/lang/Object;)I

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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p1, Lbb5;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    check-cast p1, Lbb5;

    .line 12
    .line 13
    iget-object p1, p1, Lbb5;->b:Luq3;

    .line 14
    .line 15
    iget-object p0, p0, Lbb5;->b:Luq3;

    .line 16
    .line 17
    invoke-static {p0, p1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lbb5;->b:Luq3;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

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
