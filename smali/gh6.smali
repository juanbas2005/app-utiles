.class public final Lgh6;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Luh6;


# static fields
.field public static final k:Lkg5;


# instance fields
.field public final a:Lbd5;

.field public final b:Lbd5;

.field public final c:Lbd5;

.field public final d:Led5;

.field public final e:Lap4;

.field public final f:Lbd5;

.field public g:F

.field public final h:Lhn1;

.field public final i:Loq1;

.field public final j:Loq1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lof6;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lof6;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lnf6;

    .line 9
    .line 10
    const/16 v2, 0xa

    .line 11
    .line 12
    invoke-direct {v1, v2}, Lnf6;-><init>(I)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lkg5;

    .line 16
    .line 17
    const/16 v3, 0xc

    .line 18
    .line 19
    invoke-direct {v2, v3, v0, v1}, Lkg5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sput-object v2, Lgh6;->k:Lkg5;

    .line 23
    .line 24
    return-void
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
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lbd5;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lbd5;-><init>(I)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lgh6;->a:Lbd5;

    .line 10
    .line 11
    new-instance p1, Lbd5;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {p1, v0}, Lbd5;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lgh6;->b:Lbd5;

    .line 18
    .line 19
    new-instance p1, Lbd5;

    .line 20
    .line 21
    invoke-direct {p1, v0}, Lbd5;-><init>(I)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lgh6;->c:Lbd5;

    .line 25
    .line 26
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-static {p1}, Lu55;->p(Ljava/lang/Object;)Led5;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lgh6;->d:Led5;

    .line 33
    .line 34
    new-instance p1, Lap4;

    .line 35
    .line 36
    invoke-direct {p1}, Lap4;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lgh6;->e:Lap4;

    .line 40
    .line 41
    new-instance p1, Lbd5;

    .line 42
    .line 43
    const v1, 0x7fffffff

    .line 44
    .line 45
    .line 46
    invoke-direct {p1, v1}, Lbd5;-><init>(I)V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Lgh6;->f:Lbd5;

    .line 50
    .line 51
    new-instance p1, Lay5;

    .line 52
    .line 53
    const/16 v1, 0xa

    .line 54
    .line 55
    invoke-direct {p1, v1, p0}, Lay5;-><init>(ILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    new-instance v1, Lhn1;

    .line 59
    .line 60
    invoke-direct {v1, p1}, Lhn1;-><init>(Lvr2;)V

    .line 61
    .line 62
    .line 63
    iput-object v1, p0, Lgh6;->h:Lhn1;

    .line 64
    .line 65
    new-instance p1, Lfh6;

    .line 66
    .line 67
    invoke-direct {p1, p0, v0}, Lfh6;-><init>(Lgh6;I)V

    .line 68
    .line 69
    .line 70
    invoke-static {p1}, Lu55;->i(Lsr2;)Loq1;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iput-object p1, p0, Lgh6;->i:Loq1;

    .line 75
    .line 76
    new-instance p1, Lfh6;

    .line 77
    .line 78
    const/4 v0, 0x1

    .line 79
    invoke-direct {p1, p0, v0}, Lfh6;-><init>(Lgh6;I)V

    .line 80
    .line 81
    .line 82
    invoke-static {p1}, Lu55;->i(Lsr2;)Loq1;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iput-object p1, p0, Lgh6;->j:Loq1;

    .line 87
    .line 88
    return-void
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


# virtual methods
.method public final a()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lgh6;->h:Lhn1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhn1;->a()Z

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

.method public final b()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lgh6;->j:Loq1;

    .line 2
    .line 3
    invoke-virtual {p0}, Loq1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final c()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lgh6;->i:Loq1;

    .line 2
    .line 3
    invoke-virtual {p0}, Loq1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final d(Lhq4;Lgs2;Lh61;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lgh6;->h:Lhn1;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lhn1;->d(Lhq4;Lgs2;Lh61;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object p1, Lp81;->w:Lp81;

    .line 8
    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Lvs7;->a:Lvs7;

    .line 13
    .line 14
    return-object p0
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

.method public final e(F)F
    .locals 0

    .line 1
    iget-object p0, p0, Lgh6;->h:Lhn1;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lhn1;->e(F)F

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
