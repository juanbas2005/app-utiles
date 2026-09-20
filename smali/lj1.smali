.class public final Llj1;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final b:Llj1;


# instance fields
.field public final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Llj1;

    .line 2
    .line 3
    const-string v6, "Saturday"

    .line 4
    .line 5
    const-string v7, "Sunday"

    .line 6
    .line 7
    const-string v1, "Monday"

    .line 8
    .line 9
    const-string v2, "Tuesday"

    .line 10
    .line 11
    const-string v3, "Wednesday"

    .line 12
    .line 13
    const-string v4, "Thursday"

    .line 14
    .line 15
    const-string v5, "Friday"

    .line 16
    .line 17
    filled-new-array/range {v1 .. v7}, [Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1}, Lsg3;->E([Ljava/lang/Object;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-direct {v0, v1}, Llj1;-><init>(Ljava/util/List;)V

    .line 26
    .line 27
    .line 28
    new-instance v0, Llj1;

    .line 29
    .line 30
    const-string v6, "Sat"

    .line 31
    .line 32
    const-string v7, "Sun"

    .line 33
    .line 34
    const-string v1, "Mon"

    .line 35
    .line 36
    const-string v2, "Tue"

    .line 37
    .line 38
    const-string v3, "Wed"

    .line 39
    .line 40
    const-string v4, "Thu"

    .line 41
    .line 42
    const-string v5, "Fri"

    .line 43
    .line 44
    filled-new-array/range {v1 .. v7}, [Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {v1}, Lsg3;->E([Ljava/lang/Object;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-direct {v0, v1}, Llj1;-><init>(Ljava/util/List;)V

    .line 53
    .line 54
    .line 55
    sput-object v0, Llj1;->b:Llj1;

    .line 56
    .line 57
    return-void
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Llj1;->a:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x7

    .line 11
    const/4 v2, 0x0

    .line 12
    if-ne v0, v1, :cond_4

    .line 13
    .line 14
    invoke-static {p1}, Lsg3;->v(Ljava/util/Collection;)Lre3;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Lpe3;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    :cond_0
    move-object v0, p1

    .line 23
    check-cast v0, Lqe3;

    .line 24
    .line 25
    iget-boolean v0, v0, Lqe3;->y:Z

    .line 26
    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    move-object v0, p1

    .line 30
    check-cast v0, Lje3;

    .line 31
    .line 32
    invoke-virtual {v0}, Lje3;->nextInt()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v1, p0, Llj1;->a:Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Ljava/lang/CharSequence;

    .line 43
    .line 44
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-lez v1, :cond_2

    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    :goto_0
    if-ge v1, v0, :cond_0

    .line 52
    .line 53
    iget-object v3, p0, Llj1;->a:Ljava/util/List;

    .line 54
    .line 55
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    iget-object v4, p0, Llj1;->a:Ljava/util/List;

    .line 60
    .line 61
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-static {v3, v4}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-nez v3, :cond_1

    .line 70
    .line 71
    add-int/lit8 v1, v1, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    const-string v1, "Day-of-week names must be unique, but \'"

    .line 77
    .line 78
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iget-object p0, p0, Llj1;->a:Ljava/util/List;

    .line 82
    .line 83
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    check-cast p0, Ljava/lang/String;

    .line 88
    .line 89
    const-string v0, "\' was repeated"

    .line 90
    .line 91
    invoke-static {p1, p0, v0}, Lf21;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {p0}, Lh;->j(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    throw v2

    .line 99
    :cond_2
    const-string p0, "A day-of-week name can not be empty"

    .line 100
    .line 101
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw v2

    .line 105
    :cond_3
    return-void

    .line 106
    :cond_4
    const-string p0, "Day of week names must contain exactly 7 elements"

    .line 107
    .line 108
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw v2
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
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Llj1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Llj1;

    .line 6
    .line 7
    iget-object p1, p1, Llj1;->a:Ljava/util/List;

    .line 8
    .line 9
    iget-object p0, p0, Llj1;->a:Ljava/util/List;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
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

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Llj1;->a:Ljava/util/List;

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

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    sget-object v4, Lkj1;->D:Lkj1;

    .line 2
    .line 3
    const/16 v5, 0x18

    .line 4
    .line 5
    iget-object v0, p0, Llj1;->a:Ljava/util/List;

    .line 6
    .line 7
    const-string v1, ", "

    .line 8
    .line 9
    const-string v2, "DayOfWeekNames("

    .line 10
    .line 11
    const-string v3, ")"

    .line 12
    .line 13
    invoke-static/range {v0 .. v5}, Ldt0;->E0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvr2;I)Ljava/lang/String;

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
.end method
