.class public final Lyb0;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Leq4;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Leq4;

    .line 5
    .line 6
    const/16 v1, 0x10

    .line 7
    .line 8
    new-array v1, v1, [Lzb0;

    .line 9
    .line 10
    invoke-direct {v0, v1}, Leq4;-><init>([Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lyb0;->a:Leq4;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public final a(Lly5;Lh61;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Lxb0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lxb0;

    .line 7
    .line 8
    iget v1, v0, Lxb0;->F:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lxb0;->F:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lxb0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lxb0;-><init>(Lyb0;Lh61;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lxb0;->D:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lxb0;->F:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget p0, v0, Lxb0;->C:I

    .line 35
    .line 36
    iget p1, v0, Lxb0;->B:I

    .line 37
    .line 38
    iget-object v1, v0, Lxb0;->A:[Ljava/lang/Object;

    .line 39
    .line 40
    iget-object v3, v0, Lxb0;->z:Lly5;

    .line 41
    .line 42
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    move-object p2, v3

    .line 46
    goto :goto_2

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    return-object p0

    .line 54
    :cond_2
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p0, p0, Lyb0;->a:Leq4;

    .line 58
    .line 59
    iget-object p2, p0, Leq4;->w:[Ljava/lang/Object;

    .line 60
    .line 61
    iget p0, p0, Leq4;->y:I

    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    move-object v6, p2

    .line 65
    move-object p2, p1

    .line 66
    move p1, v1

    .line 67
    move-object v1, v6

    .line 68
    :goto_1
    if-ge p1, p0, :cond_4

    .line 69
    .line 70
    aget-object v3, v1, p1

    .line 71
    .line 72
    check-cast v3, Lzb0;

    .line 73
    .line 74
    new-instance v4, Lzh;

    .line 75
    .line 76
    const/4 v5, 0x6

    .line 77
    invoke-direct {v4, v5, p2}, Lzh;-><init>(ILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    iput-object p2, v0, Lxb0;->z:Lly5;

    .line 81
    .line 82
    iput-object v1, v0, Lxb0;->A:[Ljava/lang/Object;

    .line 83
    .line 84
    iput p1, v0, Lxb0;->B:I

    .line 85
    .line 86
    iput p0, v0, Lxb0;->C:I

    .line 87
    .line 88
    iput v2, v0, Lxb0;->F:I

    .line 89
    .line 90
    invoke-static {v3, v4, v0}, Lr16;->t(Lvo1;Lsr2;Lh61;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    sget-object v4, Lp81;->w:Lp81;

    .line 95
    .line 96
    if-ne v3, v4, :cond_3

    .line 97
    .line 98
    return-object v4

    .line 99
    :cond_3
    :goto_2
    add-int/2addr p1, v2

    .line 100
    goto :goto_1

    .line 101
    :cond_4
    sget-object p0, Lvs7;->a:Lvs7;

    .line 102
    .line 103
    return-object p0
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
