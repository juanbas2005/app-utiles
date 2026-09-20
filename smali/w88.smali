.class public abstract Lw88;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lpa5;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget v0, Lb98;->c:F

    .line 2
    .line 3
    new-instance v1, Lpa5;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, v2, v0, v2, v0}, Lpa5;-><init>(FFFF)V

    .line 7
    .line 8
    .line 9
    sput-object v1, Lw88;->a:Lpa5;

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

.method public static a(ILyt2;)Lv88;
    .locals 13

    .line 1
    sget-object p0, Lch4;->b:Lt37;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lyt2;->k(Lhu5;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lzg4;

    .line 8
    .line 9
    iget-object p0, p0, Lzg4;->a:Lqt0;

    .line 10
    .line 11
    iget-object v0, p0, Lqt0;->j0:Lv88;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const v0, 0x4d56c706    # 2.2521046E8f

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lyt2;->e0(I)V

    .line 20
    .line 21
    .line 22
    sget-object v0, Lpd8;->m:Lrt0;

    .line 23
    .line 24
    invoke-static {v0, p1}, Lst0;->e(Lrt0;Lyt2;)J

    .line 25
    .line 26
    .line 27
    move-result-wide v3

    .line 28
    invoke-static {v0, p1}, Lst0;->e(Lrt0;Lyt2;)J

    .line 29
    .line 30
    .line 31
    move-result-wide v5

    .line 32
    invoke-static {p0, v5, v6}, Lst0;->a(Lqt0;J)J

    .line 33
    .line 34
    .line 35
    move-result-wide v5

    .line 36
    sget-object v0, Lhj8;->i:Lrt0;

    .line 37
    .line 38
    invoke-static {v0, p1}, Lst0;->e(Lrt0;Lyt2;)J

    .line 39
    .line 40
    .line 41
    move-result-wide v7

    .line 42
    invoke-static {v0, p1}, Lst0;->e(Lrt0;Lyt2;)J

    .line 43
    .line 44
    .line 45
    move-result-wide v9

    .line 46
    invoke-static {p0, v9, v10}, Lst0;->a(Lqt0;J)J

    .line 47
    .line 48
    .line 49
    move-result-wide v11

    .line 50
    sget-object v0, Lh49;->A:Lrt0;

    .line 51
    .line 52
    invoke-static {v0, p1}, Lst0;->e(Lrt0;Lyt2;)J

    .line 53
    .line 54
    .line 55
    move-result-wide v9

    .line 56
    const v0, 0x3ea3d70a    # 0.32f

    .line 57
    .line 58
    .line 59
    invoke-static {v0, v9, v10}, Ljt0;->b(FJ)J

    .line 60
    .line 61
    .line 62
    move-result-wide v9

    .line 63
    new-instance v2, Lv88;

    .line 64
    .line 65
    invoke-direct/range {v2 .. v12}, Lv88;-><init>(JJJJJ)V

    .line 66
    .line 67
    .line 68
    iput-object v2, p0, Lqt0;->j0:Lv88;

    .line 69
    .line 70
    invoke-virtual {p1, v1}, Lyt2;->r(Z)V

    .line 71
    .line 72
    .line 73
    return-object v2

    .line 74
    :cond_0
    const p0, 0x4d5684c9    # 2.2493915E8f

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, p0}, Lyt2;->e0(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v1}, Lyt2;->r(Z)V

    .line 81
    .line 82
    .line 83
    return-object v0
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
