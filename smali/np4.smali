.class public final Lnp4;
.super Ll66;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public A:[J

.field public B:I

.field public C:I

.field public synthetic D:Ljava/lang/Object;

.field public final synthetic E:Lop4;

.field public final synthetic F:Lbv2;

.field public y:Lbv2;

.field public z:Lop4;


# direct methods
.method public constructor <init>(Lop4;Lbv2;Lf61;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnp4;->E:Lop4;

    .line 2
    .line 3
    iput-object p2, p0, Lnp4;->F:Lbv2;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Ll66;-><init>(ILf61;)V

    .line 7
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
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lbl6;

    .line 2
    .line 3
    check-cast p2, Lf61;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lnp4;->o(Lf61;Ljava/lang/Object;)Lf61;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lnp4;

    .line 10
    .line 11
    sget-object p1, Lvs7;->a:Lvs7;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lnp4;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

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

.method public final o(Lf61;Ljava/lang/Object;)Lf61;
    .locals 2

    .line 1
    new-instance v0, Lnp4;

    .line 2
    .line 3
    iget-object v1, p0, Lnp4;->E:Lop4;

    .line 4
    .line 5
    iget-object p0, p0, Lnp4;->F:Lbv2;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p1}, Lnp4;-><init>(Lop4;Lbv2;Lf61;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, v0, Lnp4;->D:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
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

.method public final s(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lnp4;->C:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget v0, p0, Lnp4;->B:I

    .line 9
    .line 10
    iget-object v2, p0, Lnp4;->A:[J

    .line 11
    .line 12
    iget-object v3, p0, Lnp4;->z:Lop4;

    .line 13
    .line 14
    iget-object v4, p0, Lnp4;->y:Lbv2;

    .line 15
    .line 16
    iget-object v5, p0, Lnp4;->D:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v5, Lbl6;

    .line 19
    .line 20
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    return-object p0

    .line 31
    :cond_1
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lnp4;->D:Ljava/lang/Object;

    .line 35
    .line 36
    move-object v5, p1

    .line 37
    check-cast v5, Lbl6;

    .line 38
    .line 39
    iget-object v3, p0, Lnp4;->E:Lop4;

    .line 40
    .line 41
    iget-object p1, v3, Lop4;->x:Lmp4;

    .line 42
    .line 43
    iget-object v2, p1, Lmp4;->c:[J

    .line 44
    .line 45
    iget v0, p1, Lmp4;->e:I

    .line 46
    .line 47
    iget-object v4, p0, Lnp4;->F:Lbv2;

    .line 48
    .line 49
    :goto_0
    const p1, 0x7fffffff

    .line 50
    .line 51
    .line 52
    if-eq v0, p1, :cond_2

    .line 53
    .line 54
    aget-wide v6, v2, v0

    .line 55
    .line 56
    const/16 p1, 0x1f

    .line 57
    .line 58
    shr-long/2addr v6, p1

    .line 59
    const-wide/32 v8, 0x7fffffff

    .line 60
    .line 61
    .line 62
    and-long/2addr v6, v8

    .line 63
    long-to-int p1, v6

    .line 64
    iput v0, v4, Lbv2;->x:I

    .line 65
    .line 66
    iget-object v6, v3, Lop4;->x:Lmp4;

    .line 67
    .line 68
    iget-object v6, v6, Lmp4;->b:[Ljava/lang/Object;

    .line 69
    .line 70
    aget-object v0, v6, v0

    .line 71
    .line 72
    iput-object v5, p0, Lnp4;->D:Ljava/lang/Object;

    .line 73
    .line 74
    iput-object v4, p0, Lnp4;->y:Lbv2;

    .line 75
    .line 76
    iput-object v3, p0, Lnp4;->z:Lop4;

    .line 77
    .line 78
    iput-object v2, p0, Lnp4;->A:[J

    .line 79
    .line 80
    iput p1, p0, Lnp4;->B:I

    .line 81
    .line 82
    iput v1, p0, Lnp4;->C:I

    .line 83
    .line 84
    invoke-virtual {v5, p0, v0}, Lbl6;->c(Lf61;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    sget-object p0, Lp81;->w:Lp81;

    .line 88
    .line 89
    return-object p0

    .line 90
    :cond_2
    sget-object p0, Lvs7;->a:Lvs7;

    .line 91
    .line 92
    return-object p0
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
